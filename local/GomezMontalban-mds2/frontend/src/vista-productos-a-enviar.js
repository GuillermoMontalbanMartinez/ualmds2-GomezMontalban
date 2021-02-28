import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-a-enviar`
 *
 * VistaProductosAEnviar element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosAEnviar extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-productos-a-enviar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosAEnviar.is, VistaProductosAEnviar);
