import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class EmpresaDeTransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <h1 style="align-self: center;">Bienvenido, selecciona la opción que desea realizar</h1>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <vaadin-button theme="primary">
   Pedidos a entregar
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <vaadin-button theme="primary">
   Pedidos entregados
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'empresa-de-transportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(EmpresaDeTransportes.is, EmpresaDeTransportes);
