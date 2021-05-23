import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-listado-de-compras.js';

class VistaComprasAEnviar extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayoutComprasAEnviar">
 <vaadin-button id="buttonInicio" style="align-self: flex-start;" theme="primary">
   Inicio 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <h1 style="flex-shrink: 0;">Compras a enviar</h1>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-m);">
  <vaadin-button theme="primary" style="width: 100%; height: 100%; align-self: center;" id="boton_compras_enviadas">
    Compras enviadas 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-m);">
  <vaadin-button theme="primary" style="width: 104%; height: 100%; align-self: center;" id="boton_compras_a_enviar" disabled>
    Compras a enviar 
  </vaadin-button>
 </vaadin-vertical-layout>
 <h1 style="align-self: center;">Listado de compras a enviar</h1>
</vaadin-vertical-layout>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vista-listado-de-compras style="align-self: center; width: 100%;" id="vistaListadoDeCompras"></vista-listado-de-compras>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-compras-a-enviar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComprasAEnviar.is, VistaComprasAEnviar);
