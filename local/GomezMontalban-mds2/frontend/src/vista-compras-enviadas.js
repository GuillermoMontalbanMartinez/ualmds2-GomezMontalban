import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-listado-de-compras-enviadas.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center;" id="vaadinVerticalLayoutComprasEnviadas">
 <vaadin-button id="buttonCerrarSesion" style="align-self: flex-end;" theme="primary error">
  Cerrar sesion
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing">
  <h1>Compras enviadas</h1>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-m);">
  <vaadin-button theme="primary" disabled>
    Compras enviadas 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-m);">
  <vaadin-button theme="primary" style="width: 104%; align-self: center;" id="boton_compras_a_enviar">
    Compras a enviar 
  </vaadin-button>
 </vaadin-vertical-layout>
 <h1>Listado de compras a enviar</h1>
 <vista-listado-de-compras-enviadas style="width: 100%;"></vista-listado-de-compras-enviadas>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComprasEnviadas.is, VistaComprasEnviadas);
