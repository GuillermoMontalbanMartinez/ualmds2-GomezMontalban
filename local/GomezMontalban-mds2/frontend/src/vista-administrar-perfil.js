import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAdministrarPerfil extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center;">
 <h2>Administrar perfil</h2>
 <vaadin-button theme="primary" style="width: 50%; margin-bottom: var(--lumo-space-l);" id="ultimasComprasRealizadas">
   Últimas compras realizadas 
 </vaadin-button>
 <vaadin-button theme="primary" style="width: 50%; margin-bottom: var(--lumo-space-l);" id="SeguimientoPedidos">
   Seguimiento de mis pedidos 
 </vaadin-button>
 <vaadin-button theme="primary" style="width: 50%; margin-bottom: var(--lumo-space-l);" id="modificarDatosPersonales">
   Modificar datos personales 
 </vaadin-button>
 <vaadin-button theme="primary" style="width: 50%; margin-bottom: var(--lumo-space-l);" id="darBajaCuenta">
   Dar de baja esta cuenta 
 </vaadin-button>
 <vaadin-button theme="primary" style="width: 50%; margin-bottom: var(--lumo-space-l);" id="CerrarSesion">
   Cerrar sesion 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrar-perfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarPerfil.is, VistaAdministrarPerfil);
