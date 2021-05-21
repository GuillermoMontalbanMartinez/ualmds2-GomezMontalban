import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEmpresaDeTransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center; " id="vaadinVerticalLayoutEmpresaDeTransportes">
 <h1 style="align-self: center; flex-shrink: 1;">Bienvenido, selecciona la opción que desea realizar</h1>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayoutPedidosEntregar" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-button theme="primary" style="flex-shrink: 0; align-self: center;" id="vaadinButtonPedidosAEntregar">
    Pedidos a entregar 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayoutPedidosEntregados" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-button theme="primary" style="align-self: center; flex-shrink: 0;" id="vaadinButtonPedidosEntregados">
    Pedidos entregados 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empresa-de-transportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresaDeTransportes.is, VistaEmpresaDeTransportes);
