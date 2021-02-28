import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-enviados`
 *
 * VistaProductosEnviados element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosEnviados extends PolymerElement {

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
        return 'vista-productos-enviados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosEnviados.is, VistaProductosEnviados);
